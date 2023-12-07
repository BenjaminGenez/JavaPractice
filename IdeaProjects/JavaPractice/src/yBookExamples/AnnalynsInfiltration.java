package yBookExamples;

/*class AnnalynsInfiltration {
    boolean knightIsAwake = true;
    boolean archerIsAwake = true;
    boolean prisonerIsAwake = false;
    boolean petDogIsPresent = true;


    public static boolean canFastAttack(boolean knightIsAwake) {
        if (knightIsAwake == false){
            return true;
        }
        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFastAttack() method");
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if (knightIsAwake || archerIsAwake || prisonerIsAwake){
            return true;
        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSpy() method");

        }else{
            return false;
        }


    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if (prisonerIsAwake == true && archerIsAwake ==false){
            return true;
        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
    } else {
        return false;
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (petDogIsPresent == true && prisonerIsAwake == false){
            return true;
        } else if (knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == true && petDogIsPresent == false){
            return true;
        }else {
            return false;
        }



        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");
    }
}*/
class AnnalynsInfiltration {

    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return prisonerIsAwake && !archerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (petDogIsPresent) {
            return !archerIsAwake;
        } else {
            return !knightIsAwake && !archerIsAwake && prisonerIsAwake;
        }
    }
}

