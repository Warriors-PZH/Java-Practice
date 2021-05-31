#342、4的幂
## 题干 
1. 给定一个整数，写一个函数来判断它是否是 4 的幂次方。如果是，返回 true ；否则，返回 false 。整数 n 是 4 的幂次方需满足：存在整数 x 使得 n == 4x

## 解题思路
1. [解法一:](https://github.com/Warriors-PZH/Java-Practice/blob/main/342.4%E7%9A%84%E5%B9%82/method1.java) 从1开始,循环与传入数据进行比较，若不相同则乘以4，当比较结果为相同时时，return true。当比较数字大于传入参数或循环结束后，return false
