package es.upm.etsisi.simple_upm_etsisi;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import es.upm.etsisi.imagefilter.Filtros;


public class MainActivity extends AppCompatActivity {

    private ImageView ivo;
    private ImageView ive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivo  = findViewById(R.id.imageView_ejemploOriginal);
        ive  = findViewById(R.id.imageView_ejemplo);

        prueba(R.drawable.lenna);
    }


    private void prueba(int rdrawalble){
        ivo.setImageBitmap(BitmapFactory.decodeResource( getResources(), rdrawalble));

        Bitmap bm = BitmapFactory.decodeResource( getResources(), rdrawalble);


        Bitmap nbm = new Filtros(this, bm)
                //.escalaDeGrises(0.30f,0.59f,0.11f)
                //.escalaDeGrisesMedia()
//                .escalaDeGrisesHDR()
//                .invertir()
//                .histogramEqualization()
//                .blancoNegro()
//                .matiz(360f)
//                .hsva(120f, 0.84f, 0.3f)
                //.hsva(-120.0f, -1.0f, -1.0f)
//                .brillo(-120)
//                .contraste(200)
//                .posterizar(70)
//                .azulado()
//                .mediana()
//                .brillo(100)
//                .moreNeighborhood(10)
//                .prewitt()
//                .sepia()
//                .solarizar()


//                .blancoNegro(128)
//                .brillo(100)
//                .contraste(200)
//                .escalaDeGrisesHDTV()
//                .escalaDeGrisesMedia()
//                .gradiente()
//                .invertir()
//                .laplaciana()
//                .mediana()
//                .pasoAlto()
//                .pasoBajo()
//                .posterizar(70)
//                .prewitt()
//                .roberts()
//                .sepia()
//                .sobel()
                .solarizar()


//                .blancoNegro(128)

//                .brillo(100)
//                .contraste(200)
//                .escalaDeGrisesMedia()

//                .invertir()
//                .posterizar(70)
//                .prewitt()
//                .roberts()
//                .sepia()
//                .sobel()
//                .solarizar()

                .getBitmapProcessed();


        ive.setImageBitmap(nbm);
    }

}
