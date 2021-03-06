/*
 * Copyright 2015-2018 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.n52.shetland.ogc;

import java.util.Objects;

import com.google.common.base.Strings;

public class UoM {

    private String uom;

    private String name;

    private String link;

    public UoM(String uom) {
        this.uom = uom;
    }

    /**
     * @return the uom
     */
    public String getUom() {
        return uom;
    }

    /**
     * @param uom
     *            the uom to set
     * @return
     */
    public UoM setUom(String uom) {
        this.uom = uom;
        return this;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     * @return
     */
    public UoM setName(String name) {
        this.name = name;
        return this;
    }

    public boolean isSetName() {
        return !Strings.isNullOrEmpty(getName());
    }

    /**
     * @return the link
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link
     *            the link to set
     * @return
     */
    public UoM setLink(String link) {
        this.link = link;
        return this;
    }

    public boolean isSetLink() {
        return !Strings.isNullOrEmpty(getLink());
    }

    public boolean isEmpty() {
        return getUom() == null || (getUom() != null && getUom().isEmpty());
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof UoM) {
            return getUom().equals(((UoM) o).getUom());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.uom);
        return hash;
    }
}
