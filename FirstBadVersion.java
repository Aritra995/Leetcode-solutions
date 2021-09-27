/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class FirstBadVersion extends VersionControl {
        public int firstBadVersion(int n) {
            int ans = binarySearchFirstBad(0,n);
            return ans;
        }
        public int binarySearchFirstBad(int l,int r){
            if( r >= l ){
                int mid = l + (r-l) / 2;
                if( isBadVersion(mid) ){
                    // towards left
                    return binarySearchFirstBad(l,mid-1);
                }
                // towards right
                return binarySearchFirstBad(mid+1,r);
            }
            return l;
        }
    }