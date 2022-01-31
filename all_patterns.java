public class all_patterns {
    public static void main(String[] args){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/* 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
*/
// ------------------------------------------------------------------------------------------------------

public class all_patterns {
    public static void main(String[] args){
        int m = 3;
        int n = 5;
        for(int i = 1; i<=m;i++){
            for(int j =1; j<=n; j++){
                if(i ==1||j==1|| i==m||j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}

/*
* * * * * 
*       * 
* * * * * 
*/

// ------------------------------------------------------------------------------------------------------

//right angle star
public class all_patterns {
    public static void main(String[]args){
        int n = 5;
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}

/*

*
**
***
****
*****

*/

// ------------------------------------------------------------------------------------------------------
public class all_patterns {
    public static void main(String[] args) {
        int n = 10;
        //outer loop
        for(int i = n; i>=1; i--){
            //inner loop
            for(int j = 1; j<=i;j++){
            System.out.print("*");
        }
        //for the  next line
        System.out.println( );
    }
}
}
/* 

**********
*********
********
*******
******
*****
****
***
**
*

*/

// ------------------------------------------------------------------------------------------------------
public class all_patterns {
    public static void main(String[] args) {
        int m = 10;
        for(int i = 1; i<=m; i++){
            for(int j=1; j<=m-i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

//Output

/* 
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********

*/

// ------------------------------------------------------------------------------------------------------
public class all_patterns {
    public static void main(String[] args){
        int  m = 5;
        for(int i =1; i<=m;i++){
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

//Output

/*
1
12
123
1234
12345
*/


// ------------------------------------------------------------------------------------------------------
public class all_patterns {
    public static void main(String[] args){
        int  m = 5;
        for(int i =1; i<=m;i++){
            for(int j=i; j<=m;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=m-i;j++){
            //for(int j = i;j<=m-i;j++)
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

//Output

/*
    1
   12
  123
 1234
12345
*/


// ------------------------------------------------------------------------------------------------------
public class all_patterns {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}

//Output

/*
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1
*/


// ------------------------------------------------------------------------------------------------------
//floyed triangle 
public class all_patterns {
    public static void main(String[] args){
        int m = 6;
        int number = 1;
        for(int i =1; i<=m;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}

//Output

/*
1
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21
*/


// ------------------------------------------------------------------------------------------------------
// 0-1 triangle
public class all_patterns {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i;j++){
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

//Output

/*

1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 

*/

// ------------------------------------------------------------------------------------------------------
public class all_patterns {

    public static void main(String[] args) {
        int k = 5;
        
        for(int i = 1;i<=k; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        int l = 4;
        for(int s = 1;s<=l;s++){
            for(int m = 1; m<=l-s+1;m++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//Output
/*
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
*

*/


// ------------------------------------------------------------------------------------------------------
public class all_patterns {
    public static void main(String[] args) {
        int k =5;
        for(int i=1;i<=k;i++){
            for(int j = i;j<=k;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=k;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
//Output
/*
     *  *  *  *  *  
    *  *  *  *  *  
   *  *  *  *  *  
  *  *  *  *  *  
 *  *  *  *  *    
 
 */

// ------------------------------------------------------------------------------------------------------

public class all_patterns {
    public static void main(String[] args) {
        int k =5;
        for(int i=1;i<=k;i++){
            for(int j = i;j<=k;j++){ //if j = i the it will form a hollow square 
                System.out.print(" ");
            }
            for(int j =1;j<=k;j++){
                if(i==1||j==1||k==i||k==j){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
                
            }
            System.out.println();
        }
    }
}
//Output
/*
     *  *  *  *  *  
    *           *  
   *           *  
  *           *  
 *  *  *  *  *  
 */

// ------------------------------------------------------------------------------------------------------

public class all_patterns {

    public static void main(String[] args) {
        int n = 5;
        for(int i = 1;i<=n;i++){
            //first part stars
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int space = 2*(n-i);
            for(int j = 1;j<=space;j++){
                System.out.print(" ");
            }
            //2nd part stars
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i = n;i>=1;i--){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int space = 2*(n-i);
            for(int j = 1;j<=space;j++){
                System.out.print(" ");
            }
            //2nd part stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//Output
/*



*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *


*/

// ------------------------------------------------------------------------------------------------------
public class all_patterns {

    public static void main(String[] args) {
        int n = 4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        int m = 3;
        //for(int i = 1; i<=m;i++)
        for(int i = m; i>=1; i--){
            for(int j = 1; j<=i; j++){
            //for(int j = 1; j<=m-i+1;j++)
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//Output
/*
 
* 
* * 
* * * 
* * * * 
* * * 
* * 
* 

*/



// ------------------------------------------------------------------------------------------------------
public class all_patterns {

    public static void main(String[] args) {
        int n = 5;
        for(int i =1;i<=n;i++){
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
//Output
/*

    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 

*/



// ------------------------------------------------------------------------------------------------------

public class all_patterns {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = i;j>=1;j--){
                System.out.print(j);
            }
            for(int j = 2; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/*
    1
   212
  32123
 4321234
543212345

*/ 



// ------------------------------------------------------------------------------------------------------
public class all_patterns {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i>=1;i--){
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*

    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

*/



// ------------------------------------------------------------------------------------------------------

public class all_patterns {
    public static void main(String[] args) {
        int n = 5;
        for(int i = n;i>=1; i++){
            for(int j = i; j<=n;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//output
/*
    *
   ***
  *****
 *******
*********

*/


// ------------------------------------------------------------------------------------------------------

public class all_patterns {
    public static void main(String[] args) {
        int n =5;
        for(int i = 1; i<=n;i++){
            for(int j =i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j =1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//output
/*
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 

 */





// ------------------------------------------------------------------------------------------------------

public class all_patterns {
    public static void main(String[] args) {
        int n = 5;
        for(int i = n;i>=1; i--){
            for(int j = i; j<=n;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


//output
/*

 *********
  *******
   *****
    ***
     *

     
*/






// ------------------------------------------------------------------------------------------------------

public class all_patterns {
    public static void main(String[] args) {
        int n =5;
            for(int i = 1; i<=n;i++){
                for(int j =i;j<=n;j++){
                    System.out.print(" ");
                }
                for(int j =1; j<=i;j++){
                    System.out.print("* ");
                }
                int m = 2*(n-i);
                for(int j =1;j<=m;j++){
                    System.out.print(" ");
                }
                for(int j =1; j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
    }
}


//output

/*
     *         * 
    * *       * * 
   * * *     * * * 
  * * * *   * * * * 
 * * * * * * * * * * 

*/



// ------------------------------------------------------------------------------------------------------
public class all_patterns {
    public static void main(String[] args) {
        int n = 5;
        //first part 
        for(int i=1;i<=n;i++){
            for( int j = i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            //space formula
            int m = 2*(n-i);
            for(int j = 1; j<=m;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second part

        for(int i=n;i>=1;i--){ //reverse formula and logic 
            for( int j = i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            //space formula 
            int m = 2*(n-i);
            for(int j = 1; j<=m;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}

/*
     *        *
    ***      ***
   *****    *****
  *******  *******
 ******************
 ******************
  *******  *******
   *****    *****
    ***      ***
     *        *
*/






// ------------------------------------------------------------------------------------------------------

public class all_patterns {
    public static void main(String [] args){
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            int m = 2*(n-i);
            for(int j = 1;j<=m;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//output
/*

*        *
**      **
***    ***
****  ****
********** 

*/




// ------------------------------------------------------------------------------------------------------

public class all_patterns {
    public static void main(String [] args){
        int n = 5;
        //first part 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            //space formula
            int m = 2*(n-i);
            for(int j = 1;j<=m;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second part
        for(int i=n;i>=1;i--){//reverse logic
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            //space formula
            int m = 2*(n-i);
            for(int j = 1;j<=m;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//output
/*

*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *

*/






// ------------------------------------------------------------------------------------------------------
public class all_patterns {
    public static void main(String[] args){
        int n = 5;
        // 1st part 
        for(int i=1; i<n;i++){//i<n because of side point
            for(int j = i; j<=n;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // 2nd part 
        for(int i=n; i>=1;i--){
            for(int j = i; j<=n;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/* 

     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
  * * * * 
   * * * 
    * * 
     *

*/

// ------------------------------------------------------------------------------------------------------
public class all_patterns {
    public static void main(String[] args) {
        int n = 5;
        // 1st part
        for(int i =n;i>1;i--){
            for(int j = i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //2nd part
        for(int i =1;i<=n;i++){
            for(int j = i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*

 * * * * * 
  * * * * 
   * * * 
    * * 
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 

*/


// ------------------------------------------------------------------------------------------------------

public class all_patterns {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<n; i++){
            for(int j = i; j<=n;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i>=1; i--){
            for(int j = i; j<=n;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*

     *
    **
   ***
  ****
 *****
  ****
   ***
    **
     * 

*/
