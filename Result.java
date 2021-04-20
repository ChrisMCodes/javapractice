class Result {

    /*
     * From hackerrank
     * 
     * This function takes a List<Integer> of grades
     * 
     * The grades get rounded up to the nearest multiple of 5 if they are:
     *        1) above 38
     *        2) within 3 points of that multiple
     *
     * Otherwise, the grades are added as-is
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    List<Integer> finalGrades = new ArrayList<>();
    
    for (int i = 0; i < grades.size(); i++) {
        if (grades.get(i) < 38 || (grades.get(i) % 5 < 3)) {
            finalGrades.add(grades.get(i));
        } else {
            finalGrades.add(grades.get(i) + (5 - (grades.get(i) % 5)));
        } 
    }
    
    return finalGrades;

    }

}
