public class Search {
    public static Product linear(Product[]pr,int a)
    {
        for(Product i:pr)
        {
            if(i.id==a)
            {
                return i;
            }
        }
        return null;
    }
    public static Product binary (Product[]pr,int a)
    {
        int st=0,en=pr.length-1;
        while(st<=en)
        {
            int mid=(st+en)/2;
            if(mid+1==a)
            {
                return pr[mid];
            }
            else if(a>mid)
            {
                st=mid+1;
            }
            else
            {
                en=mid-1;
            }
        }
        return null;
    }
}
