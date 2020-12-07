class Teams extends MyAbsClass implements MyInterfaz{
 
 String teamName;

        Teams(String teamName){
            this.teamName = teamName;
        }

        @Override
        void iAmAbstract(){
            System.out.println(true);
        }
        @Override
        void myTime() {
            System.out.println(5);
        }

        @Override
        void myTrips() {
            System.out.println("I did Travel");
        }

        @Override
        void myGoals() {

        }

        @Override
        public void calculateScores() {
            System.out.println("");
        }

        @Override
        public void markWinner() {

        }

        @Override
        public void rankTeams() {

        }

        @Override
        public void goalScorers() {

        }

        @Override
        public void leagueTables() {

        }


        public String checker(int teamScores){
            if(teamScores % 3 == 0){
              if(teamScores % 3 == 0 && teamScores % 5 == 0){
               return "foobar";
            }
                return "foo";

            }else if(teamScores % 5 == 0){
                return "bar";
            }else{
                return "Number is not divisible";
            }

        }
}