package Chapter7OopClassesAndInherıtance;

public class StringMethods {
    public static void main(String[] args) {
        String birthDate= "26/05/1998";
        int startingIndex = birthDate.indexOf("1998");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("Birth year = " +birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(3,5));

        String newDate = String.join("/","26","05","1998");
        System.out.println("newDate = "+newDate);

        newDate = "26";
        newDate = newDate.concat("/");
        newDate = newDate.concat("05");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1998");
        System.out.println("newDate = "+newDate);


    }
}
