class StockSpanner {
    Stack<Integer> st;
    HashMap<Integer,Integer> map; // keeps the track of span of prices
    int span=0;
    public StockSpanner() {
        st=new Stack<>();
        map=new HashMap<>();
    }
    
    public int next(int price) {
        if(st.isEmpty()){       //if no previous price
            st.push(price);
            map.put(price,1);
            return 1;
        }
        else if(price>=st.peek()){    // calculating previous less aur equal prices which have occured
                span=0;
                while(!st.isEmpty() && price>=st.peek()){
                    span+=map.get(st.pop());   //adding span of removed elements so that earlier removed prices span also gets added
                 }
                 span=span+1; //adding my count to span
                 map.put(price,span);
                 st.push(price);
        }
        else{
             st.push(price);
             span=1;
             map.put(price,1);
        }
        return span;
    }
}
