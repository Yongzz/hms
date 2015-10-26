package za.ac.cput.hms.client.content.setup.forms;

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.GridLayout;
import za.ac.cput.hms.client.content.setup.models.CityModel;
import za.ac.cput.hms.client.content.setup.models.ResidenceModel;
import za.ac.cput.hms.client.content.setup.models.RoomModel;

/**
 * Created by Andies on 2015-10-23.
 */
public class ResidenceForm extends FormLayout{
    private CityModel cityModel;
    private ResidenceModel residenceModel;
    private RoomModel roomModel;
    public BeanItem<CityModel> cityModelBeanItem;
    public BeanItem<ResidenceModel> residenceModelBeanItem;
    public BeanItem<RoomModel> roomModelBeanItem;
    public FieldGroup binder;
    public final Button save = new Button("Apply");
    public final Button edit = new Button("Exit");

    public ResidenceForm(){
        this.cityModel = new CityModel();
        this.residenceModel = new ResidenceModel();
        this.roomModel = new RoomModel();
        this.binder = new FieldGroup(cityModelBeanItem);
        setSizeUndefined();
        addComponent(getLayout());
    }

    private GridLayout getLayout(){

        final GridLayout layout = new GridLayout(3,2);
        layout.setSpacing(true);

        return layout;
    }
}
