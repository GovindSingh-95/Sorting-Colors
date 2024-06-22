# Sorting-Colors
An Array consists of 0,1,2. Sort the array
<h2>Question Statement</h2>
<p>
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.<br>
<br>We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.<br>
<br>Solve this problem without using the library's sort function.<br>
  <h4>Example-1</h4>
  Input: nums = [2,0,2,1,1,0]<br>
  Output: [0,0,1,1,2,2]
  <br>
  <h4>Example-2</h4>
  Input: nums = [2,0,1]<br>
  Output: [0,1,2]
  <br>
</p>
<h2>Algorithm</h2>
<p>
Consider an Array arr and 3 variables low,mid,high,<br>
  with low=arr[0];<br>mid=arr[0];<br>high=arr[arr.length-1];<br>
  we need to make sure that low always marks end of zero,<br>
  and high marks beginning of two,<br>
  <br>
  Use while loop with break condition of high >= mid<br>
  if(arr[mid]==0)<br>
  then interchage value at mid index with low,because the low index will always mark the end of zero and increase value of both mid and low by 1<br><br>
  else if(arr[mid]==2)<br>
  then interchange value at mid index with high,because the high index will always mark the beginning of 2 and decrease the value of high by 1<br><br>
  else<br>
  just increase value of mid by 1
</p>

