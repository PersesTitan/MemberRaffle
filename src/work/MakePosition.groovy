package work

import reduce.CompareString

class MakePosition implements Names {
    // 4 개당 7
    def max = names.stream().reduce(new CompareString()).get()
    int maxSize = max.length() //가장 긴 길이를 구함

    def setTab(String value) {
        int dif = maxSize - value.length() //최대값 과의 길이 차이 구하기
        int blankSize = (int) (dif / 4 * 7)
        StringBuilder builder = new StringBuilder()
        for (int i in 1..blankSize/2)
            builder.append(" ")
        builder.append(value)
        for (int i in 1..blankSize/2)
            builder.append(" ")
        return builder.toString()
    }
}