
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;


public class ToggleableView extends View {
    protected int width;

    protected int height;

    protected boolean isOn;

    protected boolean enabled;

    protected OnToggledListener onToggledListener;

    public ToggleableView(Context context) {
        super(context);
        setBackgroundDrawable(getResources().getDrawable(R.drawable.bg_switch));
    }

    public ToggleableView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackgroundColor(getResources().getColor(R.color.lime));
        setBackgroundDrawable(getResources().getDrawable(R.drawable.bg_switch));
    }

    public ToggleableView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setBackgroundColor(getResources().getColor(R.color.lime));
        setBackgroundDrawable(getResources().getDrawable(R.drawable.bg_switch));
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setOnToggledListener(OnToggledListener onToggledListener) {
        this.onToggledListener = onToggledListener;
    }

    public interface OnToggledListener {
        void onSwitched(ToggleableView toggleableView, boolean isOn);
    }
}
