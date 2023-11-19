package com.example.crud.models;

    public enum Condition {
        GOOD("Good"),
        VERY_GOOD("Very Good"),
        FINE("Fine"),
        VERY_FINE("Very Fine"),
        EXTREMELY_FINE("Extremely Fine"),
        ABOUT_UNCIRCULATED("About Uncirculated"),
        UNCIRCULATED("Uncirculated");


        private final String label;

        Condition(String label) {
            this.label = label;
        }
        @Override
        public String toString() {
            return label;
        }
    }
