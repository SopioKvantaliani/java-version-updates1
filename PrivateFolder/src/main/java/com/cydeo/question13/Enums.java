package com.cydeo.question13;

    enum Enums {
        ONE("Hello"), TWO("TWO"), THREE("THREE");

        String s = "";

        private Enums(String s)
        {
            this.s = s;
        }

        void method()
        {
            System.out.println(s);
        }
    }


