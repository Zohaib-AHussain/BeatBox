package zohaibhussain.com.beatbox;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by zohaibhussain on 2016-01-09.
 */
public class BeatBoxFragment extends Fragment {

    private static final int GRID_COLUMNS = 3;

    @Bind(R.id.fragment_beat_box_recycler_view)
    protected RecyclerView mRecyclerView;

    public static BeatBoxFragment newInstance(){
        return new BeatBoxFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_beat_box, container, false);
        ButterKnife.bind(v);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), GRID_COLUMNS));
        mRecyclerView.setAdapter(new SoundAdapter());
        return v;
    }

    private class SoundHolder extends RecyclerView.ViewHolder{

        @Bind(R.id.list_item_sound_button)
        protected Button mButton;

        public SoundHolder(LayoutInflater inflater, ViewGroup container) {
            super(inflater.inflate(R.layout.list_item_sound, container, false));
            ButterKnife.bind(inflater.inflate(R.layout.list_item_sound, container, false));
        }
    }

    private class SoundAdapter extends RecyclerView.Adapter<SoundHolder>{

        @Override
        public SoundHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(getActivity());
            return new SoundHolder(inflater, parent);
        }

        @Override
        public void onBindViewHolder(SoundHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }
}
