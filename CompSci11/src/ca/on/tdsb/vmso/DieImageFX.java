/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.on.tdsb.vmso;

/**
 *
 * @author Owner
 */
import javafx.scene.image.Image;

// https://stackoverflow.com/questions/58903060/dice-simulator-using-javafx-images-not-appearing
public class DieImageFX 
{
    // https://www.bing.com/images/search?view=detailV2&ccid=e2TNEZ9I&id=A5FBF9D338F78D2DED26CE54A99200C79D1CC72E&thid=OIP.e2TNEZ9I_FrV0KskTyoKUAHaFp&mediaurl=http%3a%2f%2fcache3.asset-cache.net%2fgc%2f182375396-dice-1-to-6-set-gettyimages.jpg%3fv%3d1%26c%3dIWSAsset%26k%3d2%26d%3dcKtLVn2iFk6Az0aHEp2ET0eAhM%2f3BWB0%2feeyyiKLRjY%3d&exph=363&expw=476&q=dice+images+1+through+6&simid=608013776671539965&ck=E29401D68A1F641ECC1AA08A9BD26397&selectedIndex=1&ajaxhist=0
    String path = "file:.\\src\\ca\\on\\tdsb\\vmso\\res\\img\\";
    Image pic1 = new Image(path + "1.png");
    Image pic2 = new Image(path + "2.png");
    Image pic3 = new Image(path + "3.png");
    Image pic4 = new Image(path + "4.png");
    Image pic5 = new Image(path + "5.png");
    Image pic6 = new Image(path + "6.png");

    private int value;
    private Image dieImage = pic1;

    public void setImage(int sides)
    {
        int value = sides;
        
        switch(value){
            case 1:
                dieImage = pic1;
                break;
            case 2:
                dieImage = pic2;
                break;
            case 3:
                dieImage = pic3;
                break;
            case 4:
                dieImage = pic4;
                break;
            case 5:
                dieImage = pic5;
                break;
            case 6:
                dieImage = pic6;
                break;
            // todo: throw exception
        }
        
        // TO DO
        // please remove
        /*
        // issue with this code, if dieImage = pic1 then 
        // not necessary to execute all other conditions
        // that is O(1) vs O(n)
        if(value == 1)
            dieImage = pic1;
        if(value == 2)
            dieImage = pic2;
        if(value == 3)
            dieImage = pic3;
        if(value == 4)
            dieImage = pic4;
        if(value == 5)
            dieImage = pic5;
        if(value == 6)
            dieImage = pic6;
        */
    }

    public Image getImage()
    {
        return dieImage;
    }

}