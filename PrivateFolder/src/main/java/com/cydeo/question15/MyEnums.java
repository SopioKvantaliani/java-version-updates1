package com.cydeo.question15;

enum MyEnums {

        AAA, BBB, CCC;

        @Override
        public String toString() {
            return ordinal()+":"+name();
        }
    }


