class Solution {
    fun maxArea(height: IntArray): Int {
        var ans  = 0

        var left = 0
        var right = height.size-1


        while (left<right) {
            val widthValue = right-left
            val heightValue = Math.min(height[left],height[right])

            val areaValue = widthValue * heightValue

            ans = Math.max(ans,areaValue)


            if (height[left] < height[right]) {
                left++
            }
            else  {
                right--
            }
        }

        return ans
    }
}