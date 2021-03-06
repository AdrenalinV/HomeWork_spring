package ru.geekbrains.spring;

public class Product {

        private int id;
        private String title;
        private double cost;

        public Product(int id, String title, double cost) {
            this.id = id;
            this.title = title;
            this.cost = cost;
        }
        public Product(){

        }

        public int getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public double getCost() {
            return cost;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "id=" + id +'\t' +
                    "title='" + title + '\t' +
                    " cost=" + cost;
        }
    }


