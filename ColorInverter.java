import java.awt.Color;
public class ColorInverter {
    public static final int MAX_INTENSITY = 255;
	public static final int RED_IDX = 0;
	public static final int GREEN_IDX = 1;
	public static final int BLUE_IDX = 2;

	/**
	* Inverts all the colors of an image
	* @param pic – the image 
	* @return the inverted image
	*/
	public static Color[][] invertAll(Color[][] pic){
		pic = invertColor(pic, RED_IDX);
		pic = invertColor(pic, GREEN_IDX);
		pic = invertColor(pic, BLUE_IDX);
		return pic;
	}
    /**
	* inverts one color of an image.
	* @param pic - the picture to be inverted
	* @param colorIdx - the index of the color to be inverted
	* @return the inverted image
	*/
	public static Color[][] invertColor(Color[][] pic, int colorIdx){
		Color[][] ans = new Color[pic.length][pic[0].length];
		
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				ans[i][j] = invertPixelColor(pic[i][j], colorIdx);
			}
		}
		return ans;
	}

	/**
	* invert one color of a given pixel.
	* @param pixel - the color array to be inverted
	* @param colorIdx - the index of the color to be inverted
	* @return - the inverted pixel
	*/
	public static Color invertPixelColor(Color pixel, int colorIdx){
		int[] newPixel = {pixel.getRed(), pixel.getGreen(), pixel.getBlue()};
		newPixel[colorIdx] = MAX_INTENSITY - newPixel[colorIdx];
		return new Color(newPixel[RED_IDX], newPixel[GREEN_IDX], newPixel[BLUE_IDX]);
	}


}
