package challenges

/* Write a function that takes in an integer list as a parameter and returns a new list
 * of the same length with the squares of the original integers sorted in ascending order.
 * Verify your code by running SortedSquaresTester.run() in main. 
 *
 * Assumptions: The incoming list is sorted in ascending order and not empty.
 * Sample Input:  [2, 3, 5, 7, 9]
 * Sample Output: [4, 9, 25, 49, 81]
 */

 fun sortedSquares(nums: List<Int>): List<Int> {
    val numberList = nums
    val squareList = numberList.map { it * it }
    return squareList.sorted()

//Other Solution done with the prof

/* 
for sortedSquares(list: List<Int>): List<Int>{
    val result = mutableListOf<Int>()

    for(input in list){
        if (input < 0) {

        }else{
            result.add(input*input)
        }
        
    }
}
*/
}
