# language: zh-CN
#Feature: -> 功能
#  Scenario: -> 场景
#    Given  -> 假如
#    When -> 那么
#    Then -> 然后

#language: zh-CN

#  功能: 加法运算
#    场景: 相加
#  假如 x等于4和y等于5
#  当 调用相加方法
#  那么 结果将等于9

#language: zh-CN
功能: 加法运算
  场景大纲: 相加
    假如 x等于<x>和y等于<y>
    当 调用相加方法
    那么 结果将等于<result>
  例子:
  |x|y|result|
  |1|2|3     |
  |2|3|5     |
  |3|4|7     |
  |4|5|10     |

#Feature: Basic Add
#  Scenario: Addition
#    Given x is 4 and y is 5
#    When  invoke add method
#    Then the result is 10