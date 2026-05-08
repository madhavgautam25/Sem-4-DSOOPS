public class TargetMatch {
    public static boolean hasTarget(String num, String target){


        if(num.isEmpty() && target.isEmpty()) return true;
        if(num.isEmpty() || target.isEmpty()) return false;

        for(int i = 0; i < num.length(); i++){
            char digit = num.charAt(i);
            String rem = num.substring(0, i) + num.substring(i + 1);

            if(hasTarget(rem, target) || hasTarget(rem, target + digit) || hasTarget(rem, target + "+" + digit) || hasTarget(rem, target + "-" + digit) || hasTarget(rem, target + "*" + digit) || hasTarget(rem, target + "/" + digit)){
                return true;
            }
        }
        return false;

        
    }

    public static void main(String[] args) {
        String num = "123";
        String target = "9";
        boolean result = hasTarget(num, target);
        System.out.println(result);

    }
}
