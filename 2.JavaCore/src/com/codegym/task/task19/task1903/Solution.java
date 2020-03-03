package com.codegym.task.task19.task1903;

/* 
Adapting multiple interfaces

*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("US", "United States");
        countries.put("FR", "France");
    }

    public static void main(String[] args) {
        String numberPadded = String.format("%010d", 12345);
        System.out.println("+" + 1 + numberPadded.replaceFirst("(.{3})(.{3})(.{2})(.{2})", "($1)$2-$3-$4"));
    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return this.data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(this.data.getCountryCode());
        }

        @Override
        public String getName() {
            return this.data.getContactLastName() + ", " + this.data.getContactFirstName();
        }

        //@Override
        public String getPhoneNumber() {
            String numberPadded = String.format("%010d", this.data.getPhoneNumber());
            return "+" + data.getCountryPhoneCode() + numberPadded.replaceFirst("(.{3})(.{3})(.{2})(.{2})", "($1)$2-$3-$4");
            //return "+" + this.data.getCountryCode() + "(" + numberPadded.substring(0, 3) + ")" + numberPadded.substring(3, 6) + "-" + numberPadded.substring(6, 8) + "-" + numberPadded.substring(8, 10);
            //return String.format("%010d", Integer.parseInt(Integer.toString(this.data.getCountryPhoneCode())+Integer.toString(this.data.getPhoneNumber())));

        }
    }


    public static interface IncomeData {
        String getCountryCode();        // For example: US

        String getCompany();            // For example: CodeGym Ltd.

        String getContactFirstName();   // For example: John

        String getContactLastName();    // For example: Smith

        int getCountryPhoneCode();      // For example: 1

        int getPhoneNumber();           // For example: 991234567
    }

    public static interface Customer {
        String getCompanyName();        // For example: CodeGym Ltd.

        String getCountryName();        // For example: United States
    }

    public static interface Contact {
        String getName();               // For example: Smith, John

        String getPhoneNumber();        // For example: +1(099)123-45-67
    }
}