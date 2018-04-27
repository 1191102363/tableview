package com.suse.dapi.tableview.layer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

import com.suse.dapi.tableview.core.view.DrawLayer;
import com.suse.dapi.tableview.entrys.FourPerCellModel;

/**
 * Created by YuXin on 2018/4/27.
 */

public class LeftBottomLayer implements DrawLayer {

    private Paint paint;
    private int padding = 1;

    public LeftBottomLayer() {
        paint = new Paint();
        paint.setAntiAlias(true);
    }

    @Override
    public void draw(Object data, Rect rect, Canvas canvas) {

        if(data == null){
            return;
        }

        if(data instanceof FourPerCellModel){
            FourPerCellModel m = (FourPerCellModel) data;
            drawCell(m,rect,canvas);
        }

    }// end m

    private void drawCell(FourPerCellModel m, Rect rect, Canvas canvas) {
        int width = rect.width() - padding * 2;
        int height = rect.height() - padding * 2;

        if(m.isDrawLT()){
            int rx = rect.left + width / 4 + padding;
            int ry = rect.top + height / 4 + padding;
            int r = width / 4;
            paint.setColor(m.getColorLT());
            paint.setStrokeWidth(1);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(rx ,ry ,r,paint);
        }

        if(m.isDrawRT()){
            int rx = rect.left + width / 2 + padding + width / 4;
            int ry = rect.top + height / 4 + padding;
            int r = width / 4;
            paint.setColor(m.getColorRT());
            paint.setStrokeWidth(1);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(rx ,ry ,r,paint);
        }

        if(m.isDrawLB()){
            int rx = rect.left + width / 4 + padding;
            int ry = rect.top + height / 2 + padding + height / 4;
            int r = width / 4;
            paint.setColor(m.getColorLB());
            paint.setStrokeWidth(1);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(rx ,ry ,r,paint);
        }

        if(m.isDrawRB()){
            int rx =  rect.left + width / 2 + padding + width / 4;
            int ry = rect.top + height / 2 + padding + height / 4;
            int r = width / 4;
            paint.setColor(m.getColorRB());
            paint.setStrokeWidth(1);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(rx ,ry ,r,paint);
        }

    }

}