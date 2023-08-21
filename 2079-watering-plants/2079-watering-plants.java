class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int c=capacity;int steps=0;int h=0;
        for(int i=0;i<plants.length;i++)
        {
            if(plants[i]>c)
            {
                steps=steps+h*2;
                c=capacity;
                i--;
            }
            else{
               c=c-plants[i];
                h++;
            }
        }
        return steps+h;
        
    }
}