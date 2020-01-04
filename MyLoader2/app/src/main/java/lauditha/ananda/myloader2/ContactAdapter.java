package lauditha.ananda.myloader2;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContactAdapter extends CursorAdapter {
    public ContactAdapter(Context context, Cursor c, boolean b) {
        super(context, c);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.item_row_contact,
                parent, false);
    }

    @Override
    public void bindView(View view, Context context, final Cursor cursor) {
        if (cursor != null) {
            TextView tvName = view.findViewById(R.id.tv_item_name);
            CircleImageView imgUser = view.findViewById(R.id.img_item_user);
            tvName.setText(cursor.getString(cursor.getColumnIndexOrThrow(ContactsContract.Contacts.DISPLAY_NAME)));
            if (cursor.getString(cursor.getColumnIndexOrThrow(ContactsContract
                    .Contacts.PHOTO_URI)) != null) {
                imgUser.setImageURI(Uri.parse(cursor.getString(cursor.getColumnIndexOrThrow(ContactsContract.Contacts.PHOTO_URI))));
                } else {
                imgUser.setImageResource(R.drawable.ic_person_black);
                }
            }
        }
}
