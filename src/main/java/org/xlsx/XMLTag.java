package org.xlsx;

import java.util.Properties;

class XMLTag {
    private String name;
    private Properties properties;

    XMLTag(String tagName) {
        name = tagName;
    }

    public Properties getProperties() {
        if( properties == null ) {
            properties = new Properties();
        }

        return properties;
    }

    public boolean equals(Object obj) {
        return name.equals(obj);
    }
}