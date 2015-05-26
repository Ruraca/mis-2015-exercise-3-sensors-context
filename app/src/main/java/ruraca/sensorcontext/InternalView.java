package ruraca.sensorcontext;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;

/**
 * Created by Pim on 26/05/2015.
 */
public class InternalView extends View {
    private int i;
    SensorContext s;
    public InternalView(Context context){

        super(context);
        i=0;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        i=i+10;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);
        canvas.drawPaint(paint);
        /*paint.setColor(Color.RED);
        paint.setAntiAlias(true);
        canvas.drawRect(200, 200, 300, 300, paint);
        */
        if(this.getY()>0) {

            paint.setColor(Color.BLACK);
            paint.setAntiAlias(true);
            canvas.drawRect(350, 350, 450, 450, paint);
            paint.setColor(Color.BLACK);
            paint.setAntiAlias(true);
            canvas.drawRect(200, 500, 300, 600, paint);
            paint.setColor(Color.BLACK);
            paint.setAntiAlias(true);
            canvas.drawRect(50,350, 150, 450, paint);
            paint.setColor(Color.RED);
            paint.setAntiAlias(true);
            canvas.drawRect(200, 200, 300, 300, paint);
        }
        if(getX()>0) {
            paint.setColor(Color.BLACK);
            paint.setAntiAlias(true);
            canvas.drawRect(200, 200, 300, 300, paint);
            paint.setColor(Color.BLUE);
            paint.setAntiAlias(true);
            canvas.drawRect(350, 350, 450, 450, paint);
            paint.setColor(Color.BLACK);
            paint.setAntiAlias(true);
            canvas.drawRect(200, 500, 300, 600, paint);
            paint.setColor(Color.BLACK);
            paint.setAntiAlias(true);
            canvas.drawRect(50,350, 150, 450, paint);
        }
        if(getX()<0) {
            paint.setColor(Color.BLACK);
            paint.setAntiAlias(true);
            canvas.drawRect(200, 200, 300, 300, paint);
            paint.setColor(Color.BLACK);
            paint.setAntiAlias(true);
            canvas.drawRect(350, 350, 450, 450, paint);
            paint.setColor(Color.BLACK);
            paint.setAntiAlias(true);
            canvas.drawRect(200, 500, 300, 600, paint);
            paint.setColor(Color.GREEN);
            paint.setAntiAlias(true);
            canvas.drawRect(50,350, 150, 450, paint);
        }
        if(getY()<0) {
            paint.setColor(Color.BLACK);
            paint.setAntiAlias(true);
            canvas.drawRect(200, 200, 300, 300, paint);
            paint.setColor(Color.BLACK);
            paint.setAntiAlias(true);
            canvas.drawRect(350, 350, 450, 450, paint);
            paint.setColor(Color.BLACK);
            paint.setAntiAlias(true);
            canvas.drawRect(50, 350, 150, 450, paint);
            paint.setColor(Color.WHITE);
            paint.setAntiAlias(true);
            canvas.drawRect(200, 500, 300, 600, paint);
        }



    }



}
