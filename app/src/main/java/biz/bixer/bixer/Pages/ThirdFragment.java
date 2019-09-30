package biz.bixer.bixer.Pages;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AbsListView;
import android.util.Log;

import biz.bixer.bixer.R;
import biz.bixer.bixer.news.add_news1;
import biz.bixer.bixer.news.add_news2;
import biz.bixer.bixer.news.add_news3;
import biz.bixer.bixer.news.add_news4;
import biz.bixer.bixer.news.add_news5;
import biz.bixer.bixer.news.add_news6;
import biz.bixer.bixer.news.add_news7;
import biz.bixer.bixer.news.add_news8;
import biz.bixer.bixer.news.news1;

public class ThirdFragment extends Fragment {
    String[]news={"1. newsbtc.com","2. cryptoglobe.com","3. nulltx.com","4. ccn.com","5. bitcoinist.com","6. livebitcoinnews.com","7. cointelegraph.com","8. news.bitcoin.com","9. financemagnates.com"};
final String LOG_TAG="mylogs";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view= inflater.inflate(R.layout.fragment_third, container, false);
        ListView newslist=(ListView)view.findViewById(R.id.newslist);

        ArrayAdapter<String> adapter=new ArrayAdapter(getContext(),R.layout.my_list_item,news);
        newslist.setAdapter(adapter);
        newslist.setOnItemClickListener(new OnItemClickListener(){

       @Override
       public void onItemClick(AdapterView<?>parent,View v,int position,long id)
       { Fragment fragment = null;
        Class fragmentClass = null;
         String selectedItem=news[position];
         if(position==0)
             {
                 fragmentClass=add_news1.class;
             }
              if(position==1)
             {
                 fragmentClass=news1.class;
             }
              if(position==2)
             {
                 fragmentClass=add_news2.class;
             }
              if(position==3)
             {
                 fragmentClass=add_news3.class;
             }
              if(position==4)
             {
                 fragmentClass=add_news4.class;
             }
              if(position==5)
             {
                 fragmentClass=add_news5.class;
             }
              if(position==6)
             {
                 fragmentClass=add_news6.class;
             }
             if(position==7)
             {
                 fragmentClass=add_news7.class;
             }
             if(position==8)
             {
                 fragmentClass=add_news8.class;
             }
               try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Вставляем фрагмент, заменяя текущий фрагмент
        android.support.v4.app.FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.container, fragment).commit();
       }
       });
        newslist.setOnScrollListener(new OnScrollListener()
        {
            public void onScrollStateChanged(AbsListView view, int scrollState)
            {
            }
            public void onScroll(AbsListView view, int firstVisibleItem,int visibleItemCount,int totalItemCount)
            {
                Log.d(LOG_TAG,"scroll:firstVisibleItem="+firstVisibleItem
                +",visibleItemCount"+visibleItemCount
                +",totalItemCount"+totalItemCount);
            }
        });

       return view;
    }
}


