public class DuplicatedStudentId {
    public static void main(String[] args) {
    int [] n = {10,20,30,50,70,10,30,90,40};
    findDuplicate(n);
    }

    public static void findDuplicate(int id[]) {
        int[] count = new int[1000];
        for (int i = 0; i < id.length; i++) {
            count[id[i]]++;
            if (count[id[i]] >= 2) {
                System.out.println(id[i]);
            }
        }
    }
}
