// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The date format.
 */
@Fluent
public final class DateFormat implements JsonSerializable<DateFormat> {
    /*
     * An array of available locales.
     */
    @Generated
    private List<String> availableLocales;

    /*
     * Calendar
     */
    @Generated
    private Double calendar;

    /*
     * The date format.
     */
    @Generated
    private DateFormat dateInstance;

    /*
     * The date format.
     */
    @Generated
    private DateFormat dateTimeInstance;

    /*
     * The date format.
     */
    @Generated
    private DateFormat instance;

    /*
     * Determines the leniency of the date format.
     */
    @Generated
    private Boolean lenient;

    /*
     * The number format.
     */
    @Generated
    private NumberFormat numberFormat;

    /*
     * The date format.
     */
    @Generated
    private DateFormat timeInstance;

    /*
     * The timezone information.
     */
    @Generated
    private TimeZone timeZone;

    /**
     * Creates an instance of DateFormat class.
     */
    @Generated
    public DateFormat() {
    }

    /**
     * Get the availableLocales property: An array of available locales.
     * 
     * @return the availableLocales value.
     */
    @Generated
    public List<String> getAvailableLocales() {
        return this.availableLocales;
    }

    /**
     * Set the availableLocales property: An array of available locales.
     * 
     * @param availableLocales the availableLocales value to set.
     * @return the DateFormat object itself.
     */
    @Generated
    public DateFormat setAvailableLocales(List<String> availableLocales) {
        this.availableLocales = availableLocales;
        return this;
    }

    /**
     * Get the calendar property: Calendar.
     * 
     * @return the calendar value.
     */
    @Generated
    public Double getCalendar() {
        return this.calendar;
    }

    /**
     * Set the calendar property: Calendar.
     * 
     * @param calendar the calendar value to set.
     * @return the DateFormat object itself.
     */
    @Generated
    public DateFormat setCalendar(Double calendar) {
        this.calendar = calendar;
        return this;
    }

    /**
     * Get the dateInstance property: The date format.
     * 
     * @return the dateInstance value.
     */
    @Generated
    public DateFormat getDateInstance() {
        return this.dateInstance;
    }

    /**
     * Set the dateInstance property: The date format.
     * 
     * @param dateInstance the dateInstance value to set.
     * @return the DateFormat object itself.
     */
    @Generated
    public DateFormat setDateInstance(DateFormat dateInstance) {
        this.dateInstance = dateInstance;
        return this;
    }

    /**
     * Get the dateTimeInstance property: The date format.
     * 
     * @return the dateTimeInstance value.
     */
    @Generated
    public DateFormat getDateTimeInstance() {
        return this.dateTimeInstance;
    }

    /**
     * Set the dateTimeInstance property: The date format.
     * 
     * @param dateTimeInstance the dateTimeInstance value to set.
     * @return the DateFormat object itself.
     */
    @Generated
    public DateFormat setDateTimeInstance(DateFormat dateTimeInstance) {
        this.dateTimeInstance = dateTimeInstance;
        return this;
    }

    /**
     * Get the instance property: The date format.
     * 
     * @return the instance value.
     */
    @Generated
    public DateFormat getInstance() {
        return this.instance;
    }

    /**
     * Set the instance property: The date format.
     * 
     * @param instance the instance value to set.
     * @return the DateFormat object itself.
     */
    @Generated
    public DateFormat setInstance(DateFormat instance) {
        this.instance = instance;
        return this;
    }

    /**
     * Get the lenient property: Determines the leniency of the date format.
     * 
     * @return the lenient value.
     */
    @Generated
    public Boolean isLenient() {
        return this.lenient;
    }

    /**
     * Set the lenient property: Determines the leniency of the date format.
     * 
     * @param lenient the lenient value to set.
     * @return the DateFormat object itself.
     */
    @Generated
    public DateFormat setLenient(Boolean lenient) {
        this.lenient = lenient;
        return this;
    }

    /**
     * Get the numberFormat property: The number format.
     * 
     * @return the numberFormat value.
     */
    @Generated
    public NumberFormat getNumberFormat() {
        return this.numberFormat;
    }

    /**
     * Set the numberFormat property: The number format.
     * 
     * @param numberFormat the numberFormat value to set.
     * @return the DateFormat object itself.
     */
    @Generated
    public DateFormat setNumberFormat(NumberFormat numberFormat) {
        this.numberFormat = numberFormat;
        return this;
    }

    /**
     * Get the timeInstance property: The date format.
     * 
     * @return the timeInstance value.
     */
    @Generated
    public DateFormat getTimeInstance() {
        return this.timeInstance;
    }

    /**
     * Set the timeInstance property: The date format.
     * 
     * @param timeInstance the timeInstance value to set.
     * @return the DateFormat object itself.
     */
    @Generated
    public DateFormat setTimeInstance(DateFormat timeInstance) {
        this.timeInstance = timeInstance;
        return this;
    }

    /**
     * Get the timeZone property: The timezone information.
     * 
     * @return the timeZone value.
     */
    @Generated
    public TimeZone getTimeZone() {
        return this.timeZone;
    }

    /**
     * Set the timeZone property: The timezone information.
     * 
     * @param timeZone the timeZone value to set.
     * @return the DateFormat object itself.
     */
    @Generated
    public DateFormat setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("availableLocales", this.availableLocales,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeNumberField("calendar", this.calendar);
        jsonWriter.writeJsonField("dateInstance", this.dateInstance);
        jsonWriter.writeJsonField("dateTimeInstance", this.dateTimeInstance);
        jsonWriter.writeJsonField("instance", this.instance);
        jsonWriter.writeBooleanField("lenient", this.lenient);
        jsonWriter.writeJsonField("numberFormat", this.numberFormat);
        jsonWriter.writeJsonField("timeInstance", this.timeInstance);
        jsonWriter.writeJsonField("timeZone", this.timeZone);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DateFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DateFormat if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the DateFormat.
     */
    @Generated
    public static DateFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DateFormat deserializedDateFormat = new DateFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("availableLocales".equals(fieldName)) {
                    List<String> availableLocales = reader.readArray(reader1 -> reader1.getString());
                    deserializedDateFormat.availableLocales = availableLocales;
                } else if ("calendar".equals(fieldName)) {
                    deserializedDateFormat.calendar = reader.getNullable(JsonReader::getDouble);
                } else if ("dateInstance".equals(fieldName)) {
                    deserializedDateFormat.dateInstance = DateFormat.fromJson(reader);
                } else if ("dateTimeInstance".equals(fieldName)) {
                    deserializedDateFormat.dateTimeInstance = DateFormat.fromJson(reader);
                } else if ("instance".equals(fieldName)) {
                    deserializedDateFormat.instance = DateFormat.fromJson(reader);
                } else if ("lenient".equals(fieldName)) {
                    deserializedDateFormat.lenient = reader.getNullable(JsonReader::getBoolean);
                } else if ("numberFormat".equals(fieldName)) {
                    deserializedDateFormat.numberFormat = NumberFormat.fromJson(reader);
                } else if ("timeInstance".equals(fieldName)) {
                    deserializedDateFormat.timeInstance = DateFormat.fromJson(reader);
                } else if ("timeZone".equals(fieldName)) {
                    deserializedDateFormat.timeZone = TimeZone.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDateFormat;
        });
    }
}
