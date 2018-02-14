class Day1:
    def __init__(self,input):
        numbers = list(input)
        self.stuff(numbers)
        self.stuff2(numbers)

    def stuff(self,list):
        sum = 0
        for i in range(len(list)):
            if list[i - 1] == list[i]:
                sum = int(sum) + int(list[i])
        print sum

    def stuff2(self,list):
        sum = 0
        offset = int(len(list)/2)
        for i in range(offset):
            if list[i] == list[i + offset]:
                sum = int(sum) + int(list[i + offset]) + int(list[i])
        print sum

Day1(raw_input())



