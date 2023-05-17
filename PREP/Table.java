class Solution{
    static ArrayList<Integer> getTable(int N){
        ArrayList<Integer> table = new ArrayList<>();

        
        for(int i=1;i<=10;i++){
            int result=N*i;
            table.add(result);
        }
        return table;
    }
}
    public static void main(String[] args) {
        int number = 5;
        ArrayList<Integer> multiplicationTable = getTable(number);
        System.out.println(multiplicationTable);
    }
}
