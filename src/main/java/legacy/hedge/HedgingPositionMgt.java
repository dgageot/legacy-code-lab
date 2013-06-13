package legacy.hedge;

import legacy.error.CheckResult;
import legacy.dto.InputEvent;
import legacy.service.ToweringXMLHTTPServiceClient;

import org.apache.commons.lang3.SerializationUtils;

import com.google.common.annotations.*;

/**
 * <p>
 * Title: legacy.hedge.HedgingPositionMgt
 * </p>
 *
 * @author rDumas
 * @version 1.3
 * @creationDate May 7, 2011
 */
public class HedgingPositionMgt {
  public static CheckResult<HedgingPosition> hedgingPositionMgt(HedgingPosition hp) {
    CheckResult<HedgingPosition> result = new CheckResult<HedgingPosition>();
    ToweringXMLHTTPServiceClient.sendTicketToTowering(new InputEvent(hp));
    result.setCheckIsOk(true);
    result.setResult(SerializationUtils.clone(hp));
    return result;
  }
}
