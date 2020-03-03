package com.codegym.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/* 
Reinforce the adapter

*/

public class Solution {
    public static Map<String, String> countries = new HashMap<>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("US", "United States");
        countries.put("FR", "France");
    }

    public static void main(String[] args) {
        String contact="+1(111)222-3333";
        //String number=contact.substring(0,contact.indexOf(","));
        String new_number = contact.replaceAll("[^0-9]", "");;
        System.out.println("callto://+"+new_number);
    }

    public static class DataAdapter implements RowItem {
        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.contact = contact;
            this.customer = customer;
        }

        @Override
        public String getCountryCode() {
            String s = customer.getCountryName();
            for (Map.Entry<String, String> entry : countries.entrySet()) {
                String k = entry.getKey();
                String v = entry.getValue();
                if (s.equals(v))
                    return k;
            }
            return null;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            return contact.getName().substring(contact.getName().lastIndexOf(" ")+1);
        }

        @Override
        public String getContactLastName() {
            return contact.getName().substring(0,contact.getName().indexOf(","));
        }

        @Override
        public String getDialString() {
            //String number=contact.getPhoneNumber().substring(0,contact.getPhoneNumber().indexOf(","));
            String new_number = contact.getPhoneNumber().replaceAll("[^0-9]", "");;
            return "callto://+"+new_number;
        }
    }

    public static interface RowItem {
        String getCountryCode();        // For example: US

        String getCompany();            // For example: CodeGym Ltd.

        String getContactFirstName();   // For example: John

        String getContactLastName();    // For example: Peterson

        String getDialString();         // For example: callto://+11112223333
    }

    public static interface Customer {
        String getCompanyName();        // For example: CodeGym Ltd.

        String getCountryName();        // For example: United States
    }

    public static interface Contact {
        String getName();               // For example: Peterson, John

        String getPhoneNumber();        // For example: +1(111)222-3333, +3(805)0123-4567, +380(50)123-4567, etc.
    }
}