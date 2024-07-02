here is general approach of binary search

 int BinarySearchTemplate(int[] v, int cond) 
{
        int low= 0 , high=somehighvalue,ans=choose value according to question;
        while(high>=low)
        {
            int mid=(low+high)/2;
            if(findisBoundary(mid, h,cond))
            {     
                Two case
                 //1. shrink high=mid-1 or mid+1 and calucate answer
                 //2. shring low=mid+1 or mid+1 and calculate answer 
            }
            else
            {
                Two case
               //1. shrink high=mid-1 or mid+1 and calucate answer
                 //2. shring low=mid+1 or mid+1 and calculate answer 
            }
        }
        return ans ;
    }
