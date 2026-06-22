// Brute
// class RandomizedSet {

//     ArrayList<Integer> list;

//     public RandomizedSet() {
//         list = new ArrayList<>();
//     }

//     public boolean insert(int val) {

//         if(list.contains(val))
//             return false;

//         list.add(val);
//         return true;
//     }

//     public boolean remove(int val) {

//         if(!list.contains(val))
//             return false;

//         list.remove(Integer.valueOf(val));

//         return true;
//     }

//     public int getRandom() {

//         Random rand = new Random();

//         return list.get(rand.nextInt(list.size()));
//     }
// }
/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */



// Optimal
class RandomizedSet {


    ArrayList<Integer> ar;
    HashMap<Integer,Integer> mp;
    Random random;
    public RandomizedSet() {
        ar = new ArrayList<>();
        mp = new HashMap<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if(mp.containsKey(val)) return false;
        ar.add(val);
        mp.put(val,ar.size()-1);
        return true;
        
    }
    
    public boolean remove(int val) {
        
        if(!mp.containsKey(val)) return false;
        int indx = mp.get(val);
        int last = ar.get(ar.size()-1);
    ar.set(indx,last);
        mp.put(last,indx);
    ar.remove(ar.size()-1);
        mp.remove(val);
        return true;
    }
    
    public int getRandom() {
        
        int indx = random.nextInt(ar.size());
        return ar.get(indx);
    }
}