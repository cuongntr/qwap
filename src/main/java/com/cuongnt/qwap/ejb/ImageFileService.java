/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuongnt.qwap.ejb;

import com.cuongnt.qwap.entity.ImageFile;
import com.cuongnt.qwap.entity.Product;
import java.util.List;

/**
 *
 * @author richard
 */
public interface ImageFileService extends BaseService<ImageFile> {
    public List<ImageFile> getByProduct(Product product);
}
