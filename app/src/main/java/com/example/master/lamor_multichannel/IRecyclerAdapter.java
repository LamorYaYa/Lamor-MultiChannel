package com.example.master.lamor_multichannel;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class IRecyclerAdapter extends RecyclerView.Adapter<IRecyclerAdapter.IViewHolder> {

    private Context context;

    private static final String[] imgs = new String[]{
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1543213632431&di=32e2a55a8307ced025b4b77dd6aad59a&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F8%2F59b3538315367.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1543213632431&di=fec729f0f6ae3d2c74e0c79cc227411e&imgtype=0&src=http%3A%2F%2Fwww.pc6.com%2Fup%2F2014-6%2F14017806817936460.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1543213632431&di=2efdeb892d6089053a488b8a1a0a9b6e&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F2018-02-24%2F5a90fb7a416bc.jpg%3Fdown",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1543213632430&di=8201a9440d6ce36231130ad95ce4c768&imgtype=0&src=http%3A%2F%2Fdesk.fd.zol-img.com.cn%2Ft_s960x600c5%2Fg5%2FM00%2F0F%2F08%2FChMkJ1auzGWIH8LsAAhPkT97gnUAAH89gHvnVIACE-p418.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1543213632430&di=1c06827314825c8b27a1dfea955fa616&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F2017-10-25%2F59f01d7ea9b38.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1543213632430&di=bb739947c2cd96c6b424397249be06ca&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201601%2F16%2F20160116170310_H5sRm.jpeg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1543213632430&di=b51f08222cae3dc12db036296e519b4f&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F2018-04-02%2F5ac1d6191885c.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1543213632430&di=b513c76cd12ffecdc0e8a4f63b9cf8fb&imgtype=0&src=http%3A%2F%2Fuploads.xuexila.com%2Fallimg%2F1706%2F28-1F629164P8.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1543213632429&di=1cced4a94139e9c8af51874a2df608c6&imgtype=0&src=http%3A%2F%2Fpic25.photophoto.cn%2F20121203%2F0036036835475439_b.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1543213632429&di=b5ce53cc703220193a946df13156829b&imgtype=0&src=http%3A%2F%2Fimg02.tooopen.com%2Fimages%2F20150721%2Ftooopen_sy_134478976937.jpg",
    };


    public IRecyclerAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public IViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout, null);
        return new IViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull IViewHolder iViewHolder, int i) {
        try {
            Glide.with(context).load(imgs[i]).into(iViewHolder.imageView);
        } catch (Exception e) {
            Log.e("CHENGPAN", e.getMessage());
        }
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class IViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;

        public IViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imaeg_view);
        }
    }


}
