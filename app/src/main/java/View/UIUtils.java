package View;

/**
 * Created by 地地 on 2017/12/29.
 * 邮箱：461211527@qq.com.
 */
import android.util.TypedValue;

import com.liu.asus.myview.NoteApplication;

public class UIUtils {


    private static long lastClickTime;

    public static boolean isDoubleClick(int interval) {
        long currentClickTime = System.currentTimeMillis();
        if ((currentClickTime - lastClickTime) > interval) {
            lastClickTime = currentClickTime;
            return false;
        }
        return true;
    }

    public static Float dp2px(float dipValue) {
        float value = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dipValue, NoteApplication.getInstance().getResources().getDisplayMetrics());
        return value;
    }
}
