class Solution {
    public String[] solution(String[] picture, int k) {
        int row = picture.length;
        int col = picture[0].length();

        String[] newPicture = new String[row * k];

        for (int i = 0; i < row * k; i++) {
            StringBuilder sb = new StringBuilder();
            int newRow = i / k;

            for (int j = 0; j < col * k; j++) {
                int newCol = j / k;
                char pixel = picture[newRow].charAt(newCol);
                sb.append(pixel);
            }
            
            newPicture[i] = sb.toString();
        }

        return newPicture;
    }
}