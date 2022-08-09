class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        for(int i=0;i<sentences.length;i++){
            String[] array=sentences[i].split(" ");
            count=Math.max(count,array.length);
        }
        return count;
    }
}