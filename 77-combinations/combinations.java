class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> current=new ArrayList<>();
        backtrack(1,n,k,current);
        return result;
        
    }
    List<List<Integer>> result= new ArrayList<>();
    private void backtrack(int start,int n, int k,List<Integer> current){
        if(current.size()==k){
            result.add(new ArrayList<>(current));return;
        }
        for(int i=start;i<=n;i++){
            current.add(i);
            backtrack(i+1,n,k,current);
            current.removeLast();
        }
    }
}