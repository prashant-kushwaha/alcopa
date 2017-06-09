/**
 *
 */
package com.alcopa.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.alcopa.core.model.AlcopaCarProductModel;



public class AlcopaProductPopulator implements Populator<ProductModel, ProductData>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final ProductModel source, final ProductData target) throws ConversionException
	{
		

		if (source instanceof AlcopaCarProductModel)
		{
			
			final AlcopaCarProductModel temp = (AlcopaCarProductModel)source;
			
			target.setColor(temp.getColor());
			target.setVersion(temp.getVersion());
			target.setModel(temp.getModel());
			target.setEngine(temp.getEngine());
			target.setType(temp.getType());

		}

	}

}
