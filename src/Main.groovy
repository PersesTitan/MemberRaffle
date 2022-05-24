class Main implements Names {

    static void main(String[] args) {
        Random random = new Random()
        Set<Integer> set = new LinkedHashSet<>()
        while (set.size() != names.size()) set.add(random.nextInt(names.size()))
        for (int i in 0..names.size()-1) {
            if (i % column == 0) print "\n | "
            print names[set[i]] + " | "
//            print names[random.nextInt(names.size())] + " "
        }
    }
}
