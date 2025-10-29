package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Point$Int;

public interface Get_Int_By_Point<By_Typ> extends
	Get_Q_By_Point<By_Typ>,
	Get_Int_By_Q,
	Point$Int<By_Typ>
{
	@Lin_Dclar
	int Get_Int_By_Point(By_Typ By);
		@Override @Nevr_Neds_Ovrid
		default int Point$Int(By_Typ In)
		{return Get_Int_By_Point(In);}
}