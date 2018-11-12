

class lastArray {
        public static void main(String[] args){
        long startTime = System.nanoTime();
        long[] array = {1,3,4,6,5,3,2,4,56,4,2,1,2,34,520492,102391,12310,123091231,4343,1230923091,1202,43243,12321,};
            for(int i = 0; i < array.length; i++)
            {

            }
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in nanoseconds:" + timeElapsed);
    }
}

