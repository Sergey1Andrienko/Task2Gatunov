package com.company;

class Men extends Human {

        @Override
        public boolean speak(Human m1) {
            if (m1.sex == false)
                return true;
            else return false;
        }

        @Override
        public boolean somethingtime(Human m1) {
            return true;
        }

        @Override
        public boolean terpeti(Human m1) {
            if (m1.sex == false)
                return true;
            else return false;
        }

        @Override
        public Human relative(Human m1) {
            if (m1.sex == true)
                return null;
            else return m1;
        }

        public Men(String name, String surname, float casse, float weight) {
            this.name = name;
            this.casse = casse;
            this.sex = true;
            this.weight = weight;
            this.surname = surname;
        }

        public Men() {

        }

}
