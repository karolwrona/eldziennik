package com.example.eldziennik.domain;

public enum Note {
        CELUJACY(6),
        BARDZO_DOBRY(5),
        DOBRY(4),
        DOSTACZECZNY(3),
        DOPUSZCZAJACY(2),
        NIEDOSTATECZNY(1);

        private int value;

        Note(int value) {
                this.value = value;
        }

        public int getValue() {
                return value;
        }

}
