// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.identity.implementation;

import com.azure.identity.implementation.util.CertificateUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.PrivateKey;
import java.security.cert.CertificateExpiredException;
import java.security.cert.X509Certificate;
import java.time.Instant;

import java.util.Date;
import java.util.List;

public class CertificateUtilTests {

    @Test
    public void testPublicKey() throws Exception {
        String pemPath = getPath("certificate.pem");
        byte[] pemCertificateBytes = Files.readAllBytes(Paths.get(pemPath));
        List<X509Certificate> x509CertificateList = CertificateUtil.publicKeyFromPem(pemCertificateBytes);

        Assertions.assertThrows(CertificateExpiredException.class,
            () -> x509CertificateList.get(0).checkValidity(Date.from(Instant.parse("2025-12-25T00:00:00z"))));
    }

    @Test
    public void testPublicKeyChain() throws Exception {
        String pemPath = getPath("cert-chain.pem");
        byte[] pemCertificateBytes = Files.readAllBytes(Paths.get(pemPath));
        List<X509Certificate> x509CertificateList = CertificateUtil.publicKeyFromPem(pemCertificateBytes);
        Assertions.assertEquals(2, x509CertificateList.size());
        Assertions.assertThrows(CertificateExpiredException.class,
            () -> x509CertificateList.get(0).checkValidity(Date.from(Instant.parse("4025-12-25T00:00:00z"))));
    }


    @Test
    public void testPrivateKey() throws Exception {
        String pemPath = getPath("key.pem");
        byte[] pemCertificateBytes = Files.readAllBytes(Paths.get(pemPath));
        PrivateKey privateKey = CertificateUtil.privateKeyFromPem(pemCertificateBytes);
        Assertions.assertEquals("RSA", privateKey.getAlgorithm());
    }

    private String getPath(String filename) {

        String path =  getClass().getClassLoader().getResource(filename).getPath();
        if (path.contains(":")) {
            path = path.substring(1);
        }
        return path;
    }
}
